import { ReactNode } from 'react';
import { clsx } from 'clsx';

export interface CheckboxProps {}

export function Checkbox({}: CheckboxProps) {
    return (
        <div
            className={clsx(
                'py-4, px-3, bg-gray-500 rounded, w-full font-semibold, w-80, ring-1 ring-brown-200'
            )}
        />       
    )
}
